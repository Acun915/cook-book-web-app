const getRecipes = () => {
  return fetch("http://localhost:8080/rest/recipes").then((response) =>
    response.json()
  );
};

const displayRecipe = (recipe) => {
  var div = document.createElement("div");
  div.innerHTML = `
  <p><strong>${recipe.title}</strong>
    <br/> ${recipe.ingredients}
    <br/> ${recipe.content}
    <br/> ${recipe.comments}</p>
    `;
  document.querySelector("#app").append(div);
};

const displayRecipes = (recipes) => {
  recipes.forEach((recipe) => {
    displayRecipe(recipe);
  });
};

getRecipes().then((recipes) => {
  displayRecipes(recipes);
});
