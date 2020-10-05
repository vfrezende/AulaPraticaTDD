class Dollar extends Money {
  Dollar(int amount) {
    this.amount = amount;
  }
  Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
} 

class Dollar extends Money {
  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  String currency() {
    return currency;
  }

  Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }
} 