class Car:
    count = 0

    def __init__(self, make, model, price, segment='Economy', year=2024):
        self._make = make
        self._price = price
        self._model = model
        self._year = year
        self._segment = segment
        Car.count += 1

    def calculate_premium(self, tenure):
        if self._segment == 'Economy':
            return self._price * tenure * 0.05
        else:
            return self._price * tenure * 0.1

    @property
    def price(self):
        return self._price

    @price.setter
    def price(self, value):
        if value <= 0:
            raise ValueError("Price should be a positive value")
        else:
            self._price = value

    @classmethod
    def from_string(cls,data):
        make,model,price=data.split(',')
        return cls(make,model,int(price))


    @staticmethod
    def show_count():
        return Car.count

    @classmethod
    def set_count(cls):
        cls.count = 100

    def __str__(self):
        return f'Car Data:{self._make},{self._model},{self._price},{self._segment}'

    def __repr__(self):
        return f'Car ({repr(self._make)},{repr(self._model)},{repr(self._price)},{repr(self._segment)})'