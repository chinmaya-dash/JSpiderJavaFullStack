const form = document.querySelector("form");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const height = Number(document.querySelector("#height").value);
  const weight = Number(document.querySelector("#weight").value);
  const result = document.querySelector("#result");

  if (!height || height <= 0) {
    result.innerHTML = `Please enter a valid height`;
    return;
  }

  if (!weight || weight <= 0) {
    result.innerHTML = `Please enter a valid weight`;
    return;
  }

  const bmi = Number((weight / ((height * height) / 10000)).toFixed(2));

  if (bmi < 18.5) {
    result.innerHTML = `
            <span>${bmi}</span><br>
            You are underweight. Eat properly. 🍽️
        `;
  } else if (bmi >= 18.5 && bmi <= 24.9) {
    result.innerHTML = `
            <span>${bmi}</span><br>
            Normal weight. Keep going. ✅
        `;
  } else {
    result.innerHTML = `
            <span>${bmi}</span><br>
            Overweight. Control diet & exercise. 🏃‍♂️
        `;
  }
});
