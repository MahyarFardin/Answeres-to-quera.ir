def Min(numbers):
    if len(numbers)==0:
        exit(0)

    minimum=min(numbers)
    print(minimum, end=" ")
    for i in range(len(numbers)):
        if numbers[i]==minimum:
            numbers.pop(i)
            break
    Max(numbers)

def Max(numbers):
    if len(numbers)==0:
        exit(0)

    maximum=max(numbers)
    print(maximum, end=" ")
    for i in range(len(numbers)):
        if numbers[i]==maximum:
            numbers.pop(i)
            break
    return Min(numbers)

a=int(input())
numbers= list(map(int , input().split(" ")))
Max(numbers)

