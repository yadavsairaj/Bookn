--doctor samples 
INSERT INTO doctors(name, specialization) VALUES ('Dr. Mahesh Thakkar', 'Cardiologist');
INSERT INTO doctors(name, specialization) VALUES ('Dr. Rakesh Kartik', 'Dentist');
INSERT INTO doctors(name, specialization) VALUES ('Dr. Ramesh Mehta', 'Dermatologist');

--patient samples
INSERT INTO patients(name, specialization) VALUES ('Pranit Ugale', 'pranit@gmail.com');
INSERT INTO patients(name, specialization) VALUES ('Sachin Yadav', 'sachin@gmail.com');
INSERT INTO patients(name, specialization) VALUES ('Prasad Jadhav', 'prasad@gmail.com');

--appointments samples
INSERT INTO appointments(doctor_id, patient_id, appointment_time, reason) VALUES (1, 1, '2023-11-07 10:00:00', 'Routine Checkup');
INSERT INTO appointments(doctor_id, patient_id, appointment_time, reason) VALUES (2, 2, '2023-11-07 10:00:00', 'tooth removal');
INSERT INTO appointments(doctor_id, patient_id, appointment_time, reason) VALUES (3, 3, '2023-11-07 10:00:00', 'skin rash');

--user samples
INSERT INTO users(username, email, password) VALUES ('docmahesh', 'password');
INSERT INTO users(username, email, password) VALUES ('patientpranit', 'password');