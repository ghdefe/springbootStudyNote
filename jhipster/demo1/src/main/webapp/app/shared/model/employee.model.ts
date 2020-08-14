export interface IEmployee {
  id?: number;
  name?: string;
  password?: string;
  username?: string;
}

export class Employee implements IEmployee {
  constructor(public id?: number, public name?: string, public password?: string, public username?: string) {}
}
