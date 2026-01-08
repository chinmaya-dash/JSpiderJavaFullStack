
const courses = [
  { id: "java", name: "Java", price: 31000 },
  { id: "python", name: "Python", price: 32000 },
  { id: "mern", name: "MERN", price: 30000 },
];

const castDiscount = {
  SC: 5000,
  ST: 7000,
  OBC: 10000,
  General: 1000
};

const dropdown = document.getElementById("dropdown");
const coursePrice = document.getElementById("course-price");
const discountPrice = document.getElementById("discount-price");
const duePrice = document.getElementById("due-price");
const paymentPrice = document.getElementById("payment-price");
const pageContent = document.getElementById("page-content");

let selectedCourse = null;
let selectedDiscount = 0;

/* DISPLAY COURSES */
dropdown.innerHTML = courses.map(c =>
  `<li><a class="dropdown-item" data-id="${c.id}" href="#">${c.name}</a></li>`
).join("");



/* COURSE SELECT */
dropdown.addEventListener("click", e => {
  e.preventDefault();
  const id = e.target.dataset.id;
  if (!id) return;

  selectedCourse = courses.find(c => c.id === id);
  coursePrice.value = selectedCourse.price;

  // resetCalculation();
});

/* CAST SELECT */
document.querySelectorAll('input[name="cast"]').forEach(radio => {
  radio.addEventListener("change", () => {
    selectedDiscount = castDiscount[radio.value];
    discountPrice.value = selectedDiscount;
    // resetCalculation(false);
  });
});

/* CALCULATE */
document.getElementById("calc-btn").addEventListener("click", () => {
  if (!selectedCourse) {
    alert("Select a course first");
    return;
  }
  duePrice.value = Math.max(0, selectedCourse.price - selectedDiscount);
});

/* PAYMENT VALIDATION */
paymentPrice.addEventListener("input", () => {
  if (+paymentPrice.value > +duePrice.value) {
    paymentPrice.value = duePrice.value;
  }
});

/* SHOW / HIDE */
document.getElementById("show-btn").onclick = () =>
  pageContent.classList.remove("hidden");

document.getElementById("hide-btn").onclick = () =>
  pageContent.classList.add("hidden"); 

/* HELPERS */
// function resetCalculation(resetDiscount = true) {
//   duePrice.value = "";
//   paymentPrice.value = "";
//   if (resetDiscount) {
//     discountPrice.value = "";
//     selectedDiscount = 0;
//     document.querySelectorAll('input[name="cast"]').forEach(r => r.checked = false);
//   }
// }