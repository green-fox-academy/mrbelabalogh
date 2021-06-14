Table 50102 OilOrder
{

    fields
    {
        field(1; OrderedBarrels; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; BarrelPrice; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(3; OrderStartDate; Date)
        {
            DataClassification = ToBeClassified;
        }


        field(4; IsAccepted; Boolean)
        {
            DataClassification = ToBeClassified;
        }

        field(5; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(6; PetrolStationId; Integer)
        {
            FieldClass = FlowField;
            TableRelation = PetrolStation;

        }
        field(7; PetrolStationName; Text[250])
        {
            FieldClass = FlowField;
            TableRelation = PetrolStation;
            CalcFormula = lookup(PetrolStation.Name where(Id = field(PetrolStationId)));
        }
    }
}