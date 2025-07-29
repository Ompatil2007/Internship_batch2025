const bodyElement=document.querySelector("body");
console.log(bodyElement);
bodyElement.style.display="flex";
bodyElement.style.justifyContent="center"
bodyElement.style.marginTop="100px"
// bodyElement.style.backgroundColor="black";

let value1=0;
let value2=0;
let sum=0;

const headElement=document.querySelector("header");
headElement.style.border="2px solid black"
headElement.style.width="380px"
headElement.style.height="460px"

const hElement=document.querySelector("h1");
hElement.style.backgroundColor="#ecf238"



const navigate=document.querySelector("nav");
navigate.style.display="flex";
navigate.style.gap="10px";
navigate.style.justifyContent="center";
navigate.style.marginTop="30px"

const text1=document.querySelector("#val1");
text1.style.borderRadius="20px"

const text2=document.querySelector("#val2");
text2.style.borderRadius="20px"


text1.addEventListener("input",(e)=>{
    value1=Number(e.target.value);
    console.log(value1);
})

text2.addEventListener("input",(e)=>{
    value2=Number(e.target.value);
    console.log(value2);
})

const button=document.getElementById("add");
button.style.padding="6px 14px";
button.style.color="black";
button.style.backgroundColor="#ecf238";
button.style.borderRadius="20px";
button.style.fontSize="32px"
button.addEventListener("click",()=>{
 sum=value1+value2;
 alert(`Addition is:${sum}`);
})

const button1=document.getElementById("sub");
button1.style.padding="6px 18px";
button1.style.color="black";
button1.style.backgroundColor="#ecf238";
button1.style.borderRadius="20px";
button1.style.fontSize="32px"
button1.addEventListener("click",()=>{
 let minus=value1-value2;
 alert(`Subtraction is:${minus}`);
})

const button2=document.getElementById("mul");
button2.style.padding="6px 18px";
button2.style.color="black";
button2.style.backgroundColor="#ecf238";
button2.style.borderRadius="20px";
button2.style.fontSize="32px"
button2.addEventListener("click",()=>{
 let multiplication=value1*value2;
 alert(`Multiplication is:${multiplication}`);
})

const button3=document.getElementById("div");
button3.style.padding="6px 20px";
button3.style.color="black";
button3.style.backgroundColor="#ecf238";
button3.style.borderRadius="20px";
button3.style.fontSize="32px"
button3.addEventListener("click",()=>{
 let division=value1/value2;
 alert(`Division is:${division}`);
})

const sElement=document.querySelector("span");
sElement.style.display="flex";
sElement.style.gap="10px";
sElement.style.flexWrap="wrap"
sElement.style.flexDirection="column"
sElement.style.marginRight="20px"
sElement.style.marginLeft="20px"
sElement.style.marginTop="30px"
sElement.style.justifyContent="center";



