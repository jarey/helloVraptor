Feature: Manage Clinics
    In order to manage Clinics
    As a user
    I want to add, edit, delete or view Clinics

    Scenario: Create a new Clinic
        Given that I am at "SmartClinic - Clinics" page
        And I click at new
        And I fill in "clinic.name" with "Clínica São Pedro"
        And I fill in "clinic.address" with "Av. Pontes Vieira"
        And I click at save
        Then I should be at "SmartClinic - Clinics" page
        And I should see "Clínica São Pedro"
        And I should see "Av. Pontes Vieira"
