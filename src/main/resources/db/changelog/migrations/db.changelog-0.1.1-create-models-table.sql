CREATE TABLE models
(
    id SERIAL PRIMARY KEY NOT NULL,
    manufacturer_id INTEGER NOT NULL,
    name VARCHAR(50) NOT NULL
)