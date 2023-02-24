#ejercicio 1
greater=0

n1=int(input("Introduce your first number: "))
n2=int(input("Introduce your second number: "))
n3=int(input("Introduce your third number: "))

disorderList=[n1,n2,n3]

areSwitches=True
while areSwitches == True:
    areSwitches = False
    for i in range(len(disorderList)-1):
        if disorderList[i]>disorderList[i+1]:
            areSwitches = True
            disorderList[i],disorderList[i+1]=disorderList[i+1],disorderList[i]
            
print(disorderList)
lessGreater=[]
lessGreater=disorderList[:]
print(lessGreater)







            
