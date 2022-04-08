import { Component } from "@angular/core";
import { FormGroup, FormControl, Validators } from "@angular/forms";

@Component(
  {
    selector : 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
  }
)
export class AppComponent
{
  title = 'Employee Form Validation ';
  loginForm = new FormGroup({
    empid: new FormControl('', [Validators.required, Validators.minLength(5)]),
    empname: new FormControl('', [Validators.required,Validators.pattern('[a-zA-Z]+$')], ),
    empdept: new FormControl('', [Validators.required,Validators.pattern('[a-zA-Z]+$')]),
  })

  loginUser()
  {
    console.warn(this.loginForm.value)
  }

  get empid()
  {
    return this.loginForm.get('empid');
  }

  get empname()
  {
    return this.loginForm.get('empname');
  }
  get empdept()
  {
    return this.loginForm.get('empdept');
  }
}