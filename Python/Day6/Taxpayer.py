from abc import ABC,abstractmethod
class TaxPayer(ABC):
    def __init__(self,panid):
        self._panid=panid
        # self._taxableamount=taxableamount

    # @abstractmethod
    def calculate_tax(self):
        pass

    def __str__(self):
        return f'{self:_panid}'


