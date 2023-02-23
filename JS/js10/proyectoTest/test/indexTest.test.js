//effective test
/*
ECMA 5
const indexTest=require("../calculadora");
test('test add', () =>{
    const r=indexTest.add(1,2);
    expect(r).toBe(3);
})*/

//ECMA 6
import {indexTest} from "../calculadora";
test('test add', () =>{
    const r=indexTest.add(1,2);
    expect(r).toBe(3);
})
test.todo('test minus');
test.todo('test multiplication');
test.todo('test division');
