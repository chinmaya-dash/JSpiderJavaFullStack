const storedProducts = localStorage.getItem("products");

const products = storedProducts
  ? JSON.parse(storedProducts)
  : [
      {
        id: 1,
        name: "Dell Alienware Area 51M",
        price: 75000,
        rating: "⭐ 4.5 (1k+)",
        image: "./Assignment/Area51M.jpg",
        quantity: 0
      },
      {
        id: 2,
        name: "Asus ROG Strix G15",
        price: 68000,
        rating: "⭐ 4.6 (2k+)",
        image: "Area51M.jpg",
        quantity: 0
      },
      {
        id: 3,
        name: "HP Omen 16",
        price: 72000,
        rating: "⭐ 4.4 (800+)",
        image: "Area51M.jpg",
        quantity: 0
      },
      {
        id: 4,
        name: "HP Victus 16",
        price: 70000,
        rating: "⭐ 4.3 (800+)",
        image: "./Assignment/Area51M.jpg",
        quantity: 0
      }
    ];


const productContainer = document.querySelector("#productContainer");



function saveToLocalStorage() {
  localStorage.setItem("products", JSON.stringify(products));
}

function renderProducts() {
  productContainer.innerHTML = "";

  products.forEach((product, index) => {
    productContainer.innerHTML += `
      <div class="col-md-4 mb-4">
        <div class="card">
          <img src="${product.image}" class="card-img-top" alt="${product.name}">
          <div class="card-body text-center">
            <h5>${product.name}</h5>
            <h6>₹ ${product.price}</h6>
            <p>${product.rating}</p>

            <button class="btn btn-warning decrease" data-index="${index}">-</button>
            <span class="mx-2">${product.quantity}</span>
            <button class="btn btn-success increase" data-index="${index}">+</button>
          </div>
        </div>
      </div>
    `;
  });

  attachEvents();
}

function attachEvents() {
  document.querySelectorAll(".increase").forEach(btn => {
    btn.addEventListener("click", () => {
      const index = btn.dataset.index;
      products[index].quantity++;
      saveToLocalStorage();
      renderProducts();
    });
  });

  document.querySelectorAll(".decrease").forEach(btn => {
    btn.addEventListener("click", () => {
      const index = btn.dataset.index;
      if (products[index].quantity > 0) {
        products[index].quantity--;
        saveToLocalStorage();
        renderProducts();
      }
    });
  });
}

renderProducts();