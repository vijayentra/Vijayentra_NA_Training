let array = ['hello'];
array[2] = true;
console.log(array);

function greet(name) {
    console.log('hello ' + name);
}

greet('vijay');

let person = {
    name: 'vijay',
    age: 23
}

for(let k in person){
    console.log(k);
}

let colors = ['white','red'];

for(let c of colors){
    console.log(c+1);
}