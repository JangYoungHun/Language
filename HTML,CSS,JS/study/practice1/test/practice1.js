const toggle = document.querySelector(".nav_toggle");
const menu = document.querySelector(".nav_menu");
const icons = document.querySelector(".nav_icons");

toggle.addEventListener("click", ()=>{
	menu.classList.toggle("active");
	icons.classList.toggle("active");
});