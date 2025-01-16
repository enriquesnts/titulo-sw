
const imagen = document.getElementById("pfp");
imagen.onclick = () => {
    if (imagen.src.includes("imagen1.jpg")) {
        imagen.src = "aprobe.jpg";
    }
}
