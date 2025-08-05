 let cart=[];

 console.log(document.body)
const bodyElement=document.querySelector("body")
// bodyElement.style.display="grid";
//  bodyElement.style.gridTemplateRows="repeat(4,1fr)"

 fetch("https://fakestoreapi.in/api/products")
      .then(res => res.json())
      .then(data => {
        const products = data.products;
        const productsDiv = document.getElementById("products");
        productsDiv.innerHTML = ""; 
        productsDiv.style.display="grid";
        productsDiv.style.gridTemplateColumns="repeat(3,1fr)"
        productsDiv.style.marginLeft="40px"


        products.map(p => {
          const card = document.createElement("div");
          card.style.border = "1px solid #ccc";
          card.style.backgroundColor="#95dec2";
          card.style.margin = "10px";
          card.style.padding = "10px";
          card.style.width="400px";
          card.style.textAlign="center"
          card.style.gridTemplateColumns="5px"
          card.style.borderRadius="15px"       

          card.innerHTML = `
            <h3>${p.title}</h3>
            <img src="${p.image}" alt="${p.title}" style="width:100px; height:100px; object-fit:contain;">
            <p>Price: $${p.price}</p>
          `;
            
          const btn=document.createElement("button");
          productsDiv.appendChild(card); 
          card.appendChild(btn);
          btn.style.width="400px"
          btn.style.height="40px"
          btn.style.backgroundColor="#39d498"
          btn.style.borderRadius="11px"
          btn.style.border="2px solid white"


          btn.textContent="Add to Cart"

          btn.addEventListener("click",()=>{
            alert("Your Item is added to Cart");
            cart.push(p);
            console.log(cart);
          })
        });
      })
    //   .catch(() => {
    //     document.getElementById("products").innerText = "Failed to load products.";
    //   });
