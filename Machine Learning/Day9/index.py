import streamlit as st
import pickle
import numpy as np
import pandas as pd

infile=open("D:\\AshleshaRuchika\\PGCP-AI\\Machine Learning\\Day9\\bm_rf1.pkl",'rb')
objLoad=pickle.load(infile)
infile.close()

st.title("Breast Cancer")
col1,col2,col3=st.columns([0.3,0.3,0.3])

with col1:
    Clump=st.number_input(label="Clum Thickness:", min_value=1,max_value=10,step=1)
    UniCell_Size=st.number_input(label="UniCell_Size",min_value=1,max_value=10,step=1)
    Uni_CellShape=st.number_input(label="Uni_CellShape",min_value=1,max_value=10,step=1)

with col2:
    MargAdh=st.number_input(label="MargAdh",min_value=1,max_value=10,step=1)
    SEpith=st.number_input(label="SEpith",min_value=1,max_value=10,step=1)
    BareN=st.number_input(label="BAreN",min_value=1,max_value=10,step=1)
with col3:
    BChromatin=st.number_input(label="BChromatin",min_value=1,max_value=10,step=1)
    NoemN=st.number_input(label="NoemN",min_value=1, max_value=10,step=1)
    Mitoses=st.number_input(label="Mitoses",min_value=1,max_value=10,step=1)

df=pd.DataFrame({'Clump':[Clump],'UniCell_Size':[UniCell_Size],'Uni_CellShape':[Uni_CellShape],
                 'MargAdh':[MargAdh],'SEpith':[SEpith],'BareN':[BareN],
                 'BChromatin':[BChromatin],'NoemN':[NoemN],
                 'Mitoses':[Mitoses]})

pred=objLoad.predict(df)[0]
st.write('Predicted Class:{}'.format(pred))