table 50103 Applicant
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Name; Text[250])
        {
            DataClassification = ToBeClassified;

        }
        field(3; FamilySize; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if FamilySize <= 0 then begin
                    FieldError(FamilySize, 'Family Size cannot be a negative number')
                end;
            end;

        }
        field(4; MonthlyIncome; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if MonthlyIncome <= 0 then begin
                    FieldError(MonthlyIncome, 'Monthly Income cannot be a negative number')
                end;
            end;

        }
        field(5; CategoryId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Category;
            NotBlank = true;
        }

    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    begin

    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}