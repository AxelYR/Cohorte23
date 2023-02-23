// const indexTest = require("../calculadora");
import {indexTest} from "../calculadora";
test(`test suma`, ()=>{
    const resu = indexTest.suma(1,2);
    expect(resu).toBe(3);
} );
test.todo(`test resta`);
test.todo(`test multi`);
test.todo(`test div`);