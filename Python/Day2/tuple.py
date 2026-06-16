

t1 = (1,2,3)
t2 = (4,5,6)
t3=('one','two','three')
zipped=tuple(zip(t1,t2,t3))
print(zipped)

a,b,c=t1
print(a)
a,b=zipped
print(b)
for a,b,c in zipped:
    print(f'{a},{b},{c}')

def get_len(item):
    return len(item)

cards=['heart','spade','diamond','club']
cards.sort(key=get_len)
print(cards)

min_len_card=min(cards,key=get_len)
print(min_len_card)