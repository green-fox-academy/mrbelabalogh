table 50102 MyCustomer
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; CustomerName; Text[250])
        {
            DataClassification = ToBeClassified;

        }
        field(3; CityId; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; CustomerAddress; Text[250])
        {
            DataClassification = ToBeClassified;

        }
        field(5; NextCAllDate; Date)
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