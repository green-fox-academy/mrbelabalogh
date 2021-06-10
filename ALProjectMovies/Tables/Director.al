table 50101 Director

{

    fields
    {

        field(1; Name; Text[240])
        {
            DataClassification = ToBeClassified;

            trigger OnValidate()
            begin
                if StrLen(Name) = 0 then begin
                    Error('The Name field cannot be null')
                end;

                if StrLen(Name) < 3 then begin
                    Error('The Name field has to be at least 3 characters long')
                end;

            end;
        }

        field(2; DateOfBirth; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(3; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }
    }
    Keys
    {

        key(PK; Id)
        {
            Clustered = true;

        }
    }

    trigger OnInsert()
    begin
        //Message('OnInsert trigger has run');
        Validate(Rec.Name); // Runs the field's OnValidate trigger
        Rec.Name := Rec.Name.ToUpper(); // Puts String to Uppercase
    end;

    trigger OnModify()
    begin
        //Message('OnModify trigger has run');
        Rec.Name := UpperCase(Name); // Puts String to Uppercase?
    end;
}