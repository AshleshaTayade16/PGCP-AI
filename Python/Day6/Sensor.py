class TemperatureError(Exception):
    pass

class TemperatureSensor:
    def __init__(self):
        self._temperature=0

    def read_temperature(self,temperature):
        self._temperature=temperature

    def display_temperature(self):
        if self._temperature>50:
            raise TemperatureError('Temperature too high')
        else:
            print(f'Current temperature{self._temperature}')

sensor =TemperatureSensor()
try:
    sensor.display_temperature(55)
except TemperatureError as e:
    print(f'warning:{e}')


