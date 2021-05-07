import numpy as np;
import pandas as pd;
import matplotlib.pyplot as plt

dataset=pd.read_csv("iris.csv")

x=dataset["sepal length"]
y=dataset["sepal width"]

plt.hist(x,edgecolor="black")
plt.xlabel("Sepal Length") 
plt.ylabel("Count")

plt.hist(y,edgecolor="black")
plt.xlabel("Sepal Width") 
plt.ylabel("Count") 

a=float(input("Enter a = "))
b=float(input("Enter b = "))
length=len(x)
count_ab=count_b=0

for i in range(length):
    if(x[i]>a and y[i]>b):
        count_ab+=1
p_ab=count_ab/length

for i in y:
    if(i>b):
        count_b+=1
p_b=count_b/length

CP=p_ab/p_b
print(CP)
