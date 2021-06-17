table 50102 Donation
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }
        field(2; DonatorId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Donator;
            NotBlank = true;
        }

        field(3; CategoryId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Category;
            NotBlank = true;
        }
        field(4; Worth; Decimal)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Worth <= 0 then begin
                    FieldError(Worth, 'Price cannot be a negative number')
                end;
            end;
        }
        field(5; IsDonated; Boolean)
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