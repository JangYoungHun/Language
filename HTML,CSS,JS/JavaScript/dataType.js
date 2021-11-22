'use strict'

// let ES6 이상

//let name = "Jang";
let globalName = "Kim";
//Block Scope
{
	let name = "Jang";
	console.log(`scope name : ${name}`);
}

console.log(`global name : ${globalName}`);
// name = "Kang"  접근불가

// var 거의 사용 X

age = 4;
// var hoisting 선언부의 맨위로 끌어올림
var age;

{
	age1 = 4;
// var hoisting 선언부의 맨위로 끌어올림
  var age1;
}

console.log(age1)
// var변수를 밖에서 참조가능 
// Block 무시한다.
// 위험 사용 X



//Constant 불변 immutable
//최대한 불변 권장. Thread Safe, 보안
const week=7;
const month=12;

//Variable Types
const count = 17;
const size = 17.1;
console.log(`value: ${count} type: ${typeof count}`);
console.log(`value: ${size} type: ${typeof size}`);

const infinity = 1/0;
const negativeInfinity = -1/0;
const notNumber = "hello"/2;

console.log(`infinity: ${ infinity}`);
console.log(`negativeInfinity: ${negativeInfinity}`);
console.log(`notNumber: ${notNumber}`);


//Object
const profile = {
	name : "Jang",
	age : 25
}

console.log(`profile : ${profile}`);
// null
let nothing = null;

// undefined
let x;

const symbol1 = Symbol('id');
const symbol2 = Symbol('id');
console.log(symbol1 === symbol2);


const gSymbol1 = Symbol.for('id');
const gSymbol2 = Symbol.for('id');
console.log(gSymbol1===gSymbol2);

// 동적 타입
let text = 'hello';
console.log(`value: ${text} type: ${typeof text}`);
text = 1;
console.log(`value: ${text} type: ${typeof text}`);
text = '7'+5;
console.log(`value: ${text} type: ${typeof text}`);
text = '8'/'2';
console.log(`value: ${text} type: ${typeof text}`);