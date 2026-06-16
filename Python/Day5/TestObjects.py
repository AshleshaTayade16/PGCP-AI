from CarPortal import Car

Car.setcount()
c1=Car('Honda','Elevate',2000000)
c2=Car('Kia','Seltos',1800000)

c2._model='Carens'
print(c2._model)

print(c1.calculate_premium(2))
print(c2.calculate_premium(5))

print(c1)
c3 = eval(repr(c1))
print(c3)

Car.show_count()

c4 = car.from_string
print(c1.make)
c1._make = "abcd"
print(c1)

c1._price = 0
print(c1)

print(c1.calculate_premium(2))
print(c2.calculate_premium(5))