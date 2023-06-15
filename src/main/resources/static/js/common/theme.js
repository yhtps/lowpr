function setFirstTheme() {
  const lightMode = window.matchMedia("(prefers-color-scheme: light)").matches;
  if (lightMode) {
    document.body.classList.add("light-theme");
  }
}
function toggleTheme() {
  document.body.classList.toggle("light-theme");
}

window.addEventListener("load", setFirstTheme);
const themeSwitch = document.querySelector("#theme-switch");
themeSwitch.addEventListener("click", toggleTheme);
