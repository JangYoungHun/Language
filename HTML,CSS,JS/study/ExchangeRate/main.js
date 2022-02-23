let exchangeRate = {
  USD: {
    USD: 1,
    KRW: 1186.7,
    JPY: 114.84,
    unit: "달러",
  },
  KRW: {
    USD: 0.00084,
    KRW: 1,
    JPY: 0.097,
    unit: "원",
  },
  JPY: {
    USD: 0.0087,
    KRW: 10.33,
    JPY: 1,
    unit: "엔",
  },
};

document.querySelectorAll("#from-exchange-list a").forEach((item) => {
  item.addEventListener("click", function () {
    document.getElementById("from-dropbtn").textContent = this.textContent;
  });
});

document.querySelectorAll("#to-exchange-list a").forEach((item) => {
  item.addEventListener("click", function () {
    document.getElementById("to-dropbtn").textContent = this.textContent;
  });
});
