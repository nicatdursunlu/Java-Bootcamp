// Object
let sayi3 = 10
sayi3 = "İbrahim Can Erdoğan"
let student = {id:1, name:"İbrahim"}
console.log(student)


// Functions
function save1(ogrenci, puan = 10) {
    console.log("1. save fonksiyonu çalıştı!");
    console.log(ogrenci.name + ": "+ puan);
}
save1(student, 100)

function save2(puan = 10, ogrenci) {
    console.log("2. save fonksiyonu çalıştı!");
    console.log(ogrenci.name + ": "+ puan);
}
save2(undefined,student)


// Array

let students1 = ["İbrahim", "Can", "Erdoğan", "Engin"]

console.log(students1);

student = {id:1, name:"Can"}
let students2 = [student, {id:2, name:"İbrahim"}, "Ankara",{city:"İstanbul"}]

console.log(students2);


// Functions

let showProducts = function (id,...products) {
    console.log(id);
    console.log(products[0]);
}

showProducts();

showProducts(10, ["Elma","Armut", "Karpuz"]);


// Spread

let points = [1,23,94,4,56,64,1312,45,12]
console.log(...points);
console.log(Math.max(...points))

console.log("ABC", "D",..."EFG", "H");