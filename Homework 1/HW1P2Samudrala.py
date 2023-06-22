def report(xs):
    max = 0
    apartmentNumber = 0
    peopleNumber = 0
    current = 0
    for i in xs:
        if isinstance(i,int):
            apartmentNumber += 1
            if current > max:
                max = current
            current = 0
        if isinstance(i,str):
            peopleNumber+=1
            current += 1
    average = peopleNumber / apartmentNumber
    return [average,max]
print(report([100, "Jill Johnson", "Billy Ray Cyrus", 110, "Shweta Agarwal", 120, "Miguel Rosas", "Elena Rosas", "Mateo Rosas", 200, "Jason Chan", 210, "Rosalia Torres"]))