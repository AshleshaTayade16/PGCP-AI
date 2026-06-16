import streamlit as st
import pickle
import numpy as np
import pandas as pd

infile=open("D:\\AshleshaRuchika\\PGCP-AI\\Machine Learning\\Day10\\bm_rf1.pkl",'rb')
objLoad=pickle.load(infile)
infile.close()

st.title("HR")
col1,col2,col3=st.columns([0.3,0.3,0.3])

with col1:
    satisfaction_level = st.slider(
        label="Satisfaction Level:",
        key="satisfaction_level",
        min_value=0.0, max_value=1.0, step=0.01, value=0.5
    )

    last_evaluation = st.slider(
        label="Last Evaluation:",
        min_value=0.0, max_value=1.0, step=0.01, value=0.5,
        key="last_evaluation"
    )

    number_project = st.number_input(
        label="Number of projects:",
        min_value=1, max_value=20, step=1
    )

with col2:
    average_monthly_hours = st.number_input(
        label="Average Montly Hours:",
        min_value=100, max_value=400, step=1
    )

    time_spend_company = st.number_input(
        label="time_spend_company:",
        min_value=1, max_value=20, step=1
    )

    work_accident = int(st.selectbox(
        label="Work Accident 1 or 0 ?:",
        options=['0', '1']
    ))

with col3:
    promotion_last_5years=st.number_input(label="promotion_last_5years",min_value=1,max_value=10,step=1)
    department = st.selectbox("Department",
                              options=['sales', 'technical', 'support', 'IT', 'product_mng', 'marketing', 'RandD',
                                       'accounting', 'hr', 'management'])
    salary = st.selectbox("Salary Level", options=['low', 'medium', 'high'])
if st.button("Predict"):
    # Create DataFrame for prediction
    df = pd.DataFrame({
        'satisfaction_level': [satisfaction_level],
        'last_evaluation': [last_evaluation],
        'number_project': [number_project],
        'average_montly_hours': [average_montly_hours],
        'time_spend_company': [time_spend_company],
        'Work_accident': [Work_accident],
        'promotion_last_5years': [promotion_last_5years],
        'Department': [department],
        'salary': [salary]
    })

    try:
        prediction = objLoad.predict(df)[0]
        if prediction == 1:
            st.error("### Result: Likely to Leave")
        else:
            st.success("### Result: Likely to Stay")

    except Exception as e:
        st.error(f"Error during prediction: {e}")
