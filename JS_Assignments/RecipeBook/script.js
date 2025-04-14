const apiURL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";
const recipeContainer = document.getElementById("recipeContainer");
const searchInput = document.getElementById("searchInput");
const modal = document.getElementById("modal");
const modalDetails = document.getElementById("modalDetails");
const closeBtn = document.getElementById("closeBtn");
fetchRecipes();

searchInput.addEventListener("input", () => {
  const query = searchInput.value.trim();
  fetchRecipes(query);
});

async function fetchRecipes(query = "") {
  const res = await fetch(apiURL + query);
  const data = await res.json();
  displayRecipes(data.meals || []);
}

function displayRecipes(meals) {
  recipeContainer.innerHTML = "";

  if (meals.length === 0) {
    recipeContainer.innerHTML = "<p>No recipes found </p>";
    return;
  }

  meals.forEach(meal => {
    const card = document.createElement("div");
    card.className = "recipe-card";
    card.innerHTML = `
      <img src="${meal.strMealThumb}" alt="${meal.strMeal}">
      <div class="card-body">
        <h3>${meal.strMeal}</h3>
        <marquee>${meal.strCategory} | ${meal.strArea}</marquee>
      </div>
    `;
    card.onclick = () => showModal(meal);
    recipeContainer.appendChild(card);
  });
}

function showModal(meal) {
  const ingredients = [];
  for (let i = 1; i <= 20; i++) {
    const ing = meal[`strIngredient${i}`];
    const measure = meal[`strMeasure${i}`];
    if (ing && ing.trim()) ingredients.push(`${measure} - ${ing}`);
  }

  modalDetails.innerHTML = `
    <h2>${meal.strMeal}</h2>
    <img src="${meal.strMealThumb}" alt="${meal.strMeal}" style="width: 100%; height:350px; margin: 15px 0; ">
    <h3>Ingredients:</h3>
    <ol style="padding-left:20px;">${ingredients.map(i => `<li>${i}</li>`).join('')}</ol>
    <h3 style="margin-top: 15px;">Instructions:</h3>
    <p>${meal.strInstructions}</p>
    <div style="margin-top: 15px; display: flex; align-items: center; ">
    <svg xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="80" height="80" viewBox="0 0 48 48">
<path fill="#FF3D00" d="M43.2,33.9c-0.4,2.1-2.1,3.7-4.2,4c-3.3,0.5-8.8,1.1-15,1.1c-6.1,0-11.6-0.6-15-1.1c-2.1-0.3-3.8-1.9-4.2-4C4.4,31.6,4,28.2,4,24c0-4.2,0.4-7.6,0.8-9.9c0.4-2.1,2.1-3.7,4.2-4C12.3,9.6,17.8,9,24,9c6.2,0,11.6,0.6,15,1.1c2.1,0.3,3.8,1.9,4.2,4c0.4,2.3,0.9,5.7,0.9,9.9C44,28.2,43.6,31.6,43.2,33.9z"></path><path fill="#FFF" d="M20 31L20 17 32 24z"></path>
</svg>
    <a href="${meal.strYoutube}" target="_blank" style="text-decoration: none; color: #FF3D00; font-weight: bold; margin-left: 10px;">Watch it on Youtube</a>
  </div>
    `;
  modalDetails.style.padding = "20px";
  modal.classList.remove("hidden");
}

closeBtn.addEventListener("click", () => {
  modal.classList.add("hidden");
});
