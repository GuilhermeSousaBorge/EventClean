

CREATE TABLE Fichas_treinos (
    id BIGSERIAL PRIMARY KEY,
    exercise_name VARCHAR(255) NOT NULL,
    week_day VARCHAR(255) NOT NULL,
    advanced_technique VARCHAR(255),
    url_video VARCHAR(255),
    sets INTEGER NOT NULL,
    reps INTEGER NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
)