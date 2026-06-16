import sys
import traceback as tb
try:
    dividend=int(input('Enter dividend: '))
    divisor=int(input('Enter divisor: '))
    result=dividend/divisor
    print(result)
except ZeroDivisionError as err:
    print(f'{err} : Divisor cannot be zero')
    e_type,e_cause,tb=sys.exc_info()
    #print class and message for an error object
    print(f'{e_type}, {e_cause} ')
except ValueError as err:
    print(err)
    tb.print_exc()
else:
    print('continue')
finally:
    print('XYZ')
