Table 50101 PetrolStation
{

    fields
    {
        field(1; Name; Text[250])
        {
            DataClassification = ToBeClassified;
        }

        field(2; AmountOfEuros; Integer)
        {
            DataClassification = ToBeClassified;
            
        }

        field(3; ContractStartDate; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate();
            var
                ThisYear: Date;
            begin
                ThisYear := Today;
                if (ContractStartDate < ThisYear) then begin
                    FieldError(ContractStartDate, 'The date has to be Today or after that!');
                end;
            end;
        }

        field(4; ContractEndDate; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate();
            begin
                if (ContractEndDate < ContractStartDate) then begin
                    FieldError(ContractEndDate, 'The Contract End Date cannot be older than the Contract Start Date!');
                end
            end;
        }

        field(5; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

    }
}