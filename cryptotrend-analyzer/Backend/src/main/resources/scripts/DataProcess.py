import pandas as pd
import numpy as np

def process_data(raw_data):
    # Convert JSON to DataFrame
    df = pd.DataFrame(raw_data)

    # Data cleaning
    df['price'] = pd.to_numeric(df['price'], errors='coerce')
    df['volume'] = pd.to_numeric(df['volume'], errors='coerce')
    df.dropna(inplace=True)

    # Data aggregation
    avg_price = np.mean(df['price'])
    total_volume = np.sum(df['volume'])

    return {
        'average_price': avg_price,
        'total_volume': total_volume,
        'processed_data': df.to_json(orient='records')
    }
