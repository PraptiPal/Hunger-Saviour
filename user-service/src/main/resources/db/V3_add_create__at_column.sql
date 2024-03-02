-- add column to users table
alter table users
add column created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP;