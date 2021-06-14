table 50101 City
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; CityName; Text[250])
        {
            DataClassification = ToBeClassified;

        }
        field(3; Latitude; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; Longitude; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(5; CountryId; Integer)
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