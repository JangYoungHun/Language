let mainText = document.querySelector(".banner1 h1");

window.addEventListener("scroll", () => {
  let scrollHeight = window.scrollY;
  console.log(scrollHeight);
  if (scrollHeight >= 700) {
    mainText.style.animation = "disappear 1s ease-out forwards";
  } else {
    mainText.style.animation = "appear 1s ease-out forwards";
  }
});
