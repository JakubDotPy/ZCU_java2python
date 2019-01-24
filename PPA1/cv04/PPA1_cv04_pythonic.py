eqn = input('Zadej rovnici ve tvaru: ax + b = 0\n').split(' ')
a = int(eqn[0][:-1])
b = int(eqn[2]) if eqn[1] == '+' else -int(eqn[2])
if a == b == 0:
    print('rovnice ma nekonecne reseni')
elif a == 0:
    print('rovnice nema reseni v R')
elif b == 0:
    print('rovnice ma reseni: x = 0')
else:
    print(f'rovnice ma reseni: x = {-b/a:.2f}')