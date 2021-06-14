table 50105 Call
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; EmployeeId; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(3; StartTime; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; EndTime; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(5; CallOutcomeId; Integer)
        {
            DataClassification = ToBeClassified;
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