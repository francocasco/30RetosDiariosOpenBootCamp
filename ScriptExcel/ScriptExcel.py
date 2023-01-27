#importar librerias
import pandas as pd

print("Escriba la direccion del archivo excel")
url=input()
print(url)

#lectura del archivo xlsx

notas_df=pd.read_excel(url)

# Mostrar el contenido del libro1
print(notas_df[['Email']])

# C:/Users/Nicolas/Desktop/nombres.xlsx