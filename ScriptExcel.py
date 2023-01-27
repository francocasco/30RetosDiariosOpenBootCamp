# librerias
# pip install numpy
# pip install pandas
# pip install openpyxl

#importar librerias
import numpy as np
import pandas as pd

#lectura del archivo xlsx

notas_df=pd.read_excel('nombres.xlsx')

# Mostrar el contenido del libro1
print(notas_df[['Email']])

