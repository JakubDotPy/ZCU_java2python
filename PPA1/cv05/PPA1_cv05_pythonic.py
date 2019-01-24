import timeit


def prvocisla():
    '''
    vypisuje prvocisla mensi nez zadane cislo
    '''
    num = int(input('zadej cislo: '))

    def isPrime(n):
        for i in range(2, n):
            if n % i == 0:
                return False

        return True

    print([x for x in range(num + 1) if isPrime(x) is True])


# prvocisla()

def pocet_zprava():
    '''
    oreze cislo zprava
    :return:
    '''
    num = input("Zadej puvodni cislo (max. 999): ")
    right = int(input("Zadej pocet cifer zprava (max. 3): "))
    if right < 1000:
        print(f'zprava je: {int(num[-right:])}')
    else:
        print('spatne zadano')


#pocet_zprava()


def realne_cislo():
    '''
    urci sudost lichost cele casti realneho cisla
    :return:
    '''

    num = float(input('zadej realne cislo: '))
    print(f'cela cas realneho cisla je {"suda" if int(num) % 2 is 0 else "licha"}')

realne_cislo()