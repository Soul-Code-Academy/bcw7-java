import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SecurityService {

  baseUrl: String = 'http://localhost:8080/seguranca'

  constructor() { }
}
