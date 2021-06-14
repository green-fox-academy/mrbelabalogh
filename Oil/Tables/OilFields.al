Table 50100 OilFields
{
    Caption = 'Oil Fields';
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, SumOfBarrelOil, WeeklyOilIncome, MonthlyExpense, Location;

    fields
    {
        field(1; SumOfBarrelOil; Integer)
        {
            DataClassification = ToBeClassified;

            trigger OnValidate()
            begin
                if Rec.SumOfBarrelOil < 10000 then begin
                    Error('The Sum of Oil Barrels must be 10 000 or greater')
                end;

            end;
        }

        field(2; WeeklyOilIncome; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(3; MonthlyExpense; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(4; Location; Text[250])
        {
            DataClassification = ToBeClassified;
        }

        field(5; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }
    }

    trigger OnInsert()
    begin

        // TestField(Title);
        Validate(Rec.SumOfBarrelOil);
        //Rec.HoursToRead := (Rec.PageCount * 2) / 60;
        /*
        if StrLen(Rec.Title) = 0 then begin
            Error('The title field should not be empty.');
            exit;
        end;*/

    end;
}