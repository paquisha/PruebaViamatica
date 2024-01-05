import { Component } from '@angular/core';
import { AuthService } from '../_services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  form: any = {
    username: null,
    name: null,
    lastname: null,
    ci: null,
    email: null,
    password: null
  };
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';

  constructor(private authService: AuthService) { }

  validateCiFormat(event: any) {
    const inputValue: string = event.target.value;

    if (/(\d)\1{3}/.test(inputValue)) {
      this.form.ci = '';
      this.form.ci.setErrors({ invalidFormat: true });
    }
  }

  onSubmit(): void {
    const { username, name, lastname, ci, email, password } = this.form;

    let cedula = parseInt(ci);

    this.authService.register(username, name, lastname, cedula, email, password).subscribe({
      next: data => {
        console.log(data);
        this.isSuccessful = true;
        this.isSignUpFailed = false;
      },
      error: err => {
        this.errorMessage = err.error.message;
        this.isSignUpFailed = true;
      }
    });
  }
}
