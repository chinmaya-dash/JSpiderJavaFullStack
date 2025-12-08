// console.log(1 && 0);//0
// console.log(true && false);//false
// console.log("jsp" && "qsp");//qsp
// console.log(NaN && "qsp");//NAN
// console.log(NaN && null);//NAN

// console.log("" && " ");

// console.log(NaN && null);//NAN
// console.log(1 && "hi" && 0 && NaN && "jsp");//0

// if (checked) {
//     disolay
// } else {
//     hide
// }
// or
// checked && <div></div>
// console.log(~ 12);

// let n = 7;

// console.log(Math.trunc(n+n/3));

function main() {
  //   let n = 7;
  //   if (n % 2 == 0) n++;
  //   ++n;
  //   n++;
  //   console.log(n);
  //   let color = "green";
  //   color = "red"
  //   if (color == "red") {
  //     console.log("Stop");
  //   } else if (color == "orange") {
  //     console.log("get ready");
  //   } else if (color == 'green') {
  //     console.log("gooooo...");
  //   }
  //   let ammount = 4440;
  //   let twothousand = 0;
  //   let fivehundred = 0;
  //   let twohundred = 0;
  //   let hundreds = 0;
  // if (ammount < 100) {
  //     {
  //     console.log(`${ammount} can not withdraw not available`);
  //   }
  // }
  //   if (ammount >= 2000) {
  //     twothousand = Math.trunc(ammount / 2000);
  //     ammount -= twothousand * 2000;
  //     console.log(`2000 * ${twothousand} = ${twothousand}`);
  //   }
  //   if (ammount >= 500) {
  //     fivehundred = Math.trunc(ammount / 500);
  //     ammount -= fivehundred * 500;
  //     console.log(`500 * ${fivehundred} = ${fivehundred}`);
  //   }
  //   if (ammount >= 200) {
  //     twohundred = Math.trunc(ammount / 200);
  //     ammount -= twohundred * 200;
  //     console.log(`200 * ${twohundred} = ${twohundred}`);
  //   }
  //   if (ammount >= 100) {
  //     hundreds = Math.trunc(ammount / 100);
  //     ammount -= hundreds * 100;
  //     console.log(`100 * ${hundreds} = ${hundreds}`);
  //   }
  //   console.log("2000 = "+twothousand+",\n 500 = "+fivehundred+",\n 200 = "+twohundred+",\n 100 = "+hundreds);
  //   let str = "";
  //   for (let index = 1; index <= 5; index++) {
  //     if (index <= 4) {
  //         str=str+index+" "
  //     }else{
  //         str+=index
  //     }
  // }
  // console.log(str);
  // let num = 5;
  // let factorials = 1;
  // for (let index = num; index >=1 ; index--) {
  //   factorials *= index;
  // }
  // console.log(factorials);
  // console.log("Inside function");
  // for (let index = 1; index <= 10; index++) {
  //   if (index % 2 == 0) {
  //     // break;//terminate the for loop
  //     // continue;//skipps the even iteration
  //     return; //terminates the function
  //   }
  //   console.log("Inside for loop");
  //   console.log(index);
  // }
  // console.log("Outside for loop");

  // console.log("Outside function");

// prime number check

  // let n = 2;
  // for (let i = 2; i < Math.trunc(n / 2); i++) {
  //   if (n % i == 0) {
  //     console.log(`${n} is not a prime number`);
  //     break;
  //   } else {
  //     console.log(`${n} is  a prime number`);
  //     break;
  //   }
  // }

// 06 - 12 - 25

// n();
// function n() {
//   console.log("hi");
//   console.log(m2());
  
// }

// if(1 == 1) {
//   // let n = 20+20
//   var i = 10
//   // console.log(n);
//   // return n;
// }

// // console.log(n);

// console.log(i);

function m1() {
  let i = 0
  let j = 0
  j = m3(++i) + m3(i++);
  console.log(i, j);
  
}
function m3(n) {
  return n++;
}

m1();

}
main();
